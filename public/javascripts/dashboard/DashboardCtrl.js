(function() {
    var DashboardCtrl;

    DashboardCtrl = (function() {
        function DashboardCtrl($log, DashboardService) {
            this.$log = $log;
            this.DashboardService = DashboardService;
            this.$log.debug("constructing DashboardController");
            this.offers = [];
            this.getAllOffers();
        }

        DashboardCtrl.prototype.getAllOffers = function() {
            this.$log.debug("getAllOffers()");
            return this.DashboardService.listOffers().then((function(_this) {
                return function(data) {
                    _this.$log.debug("Promise returned " + data.length + " offers");
                    return _this.offers = data;
                };
            })(this), (function(_this) {
                return function(error) {
                    return _this.$log.error("Unable to get Offers: " + error);
                };
            })(this));
        };

        return DashboardCtrl;

    })();

    controllersModule.controller('DashboardCtrl', ['$log', 'DashboardService', DashboardCtrl]);

}).call(this);