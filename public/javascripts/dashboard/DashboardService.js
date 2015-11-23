(function() {
    var DashboardService;

    DashboardService = (function() {
        DashboardService.headers = {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        };

        DashboardService.defaultConfig = {
            headers: DashboardService.headers
        };

        function DashboardService($log, $http, $q) {
            this.$log = $log;
            this.$http = $http;
            this.$q = $q;
            this.$log.debug("constructing DashboardService");
        }

        DashboardService.prototype.listOffers = function() {
            var deferred;
            this.$log.debug("listOffers()");
            deferred = this.$q.defer();
            this.$http.get("/offers").success((function(_this) {
                return function(data, status, headers) {
                    _this.$log.info("Successfully listed Offers - status " + status);
                    return deferred.resolve(data);
                };
            })(this)).error((function(_this) {
                return function(data, status, headers) {
                    _this.$log.error("Failed to list Offers - status " + status);
                    return deferred.reject(data);
                };
            })(this));
            return deferred.promise;
        };

        return DashboardService;

    })();

    servicesModule.service('DashboardService', ['$log', '$http', '$q', DashboardService]);

}).call(this);
