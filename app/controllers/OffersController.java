package controllers;

import models.Offer;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OffersController extends Controller {

    public Result topOffers() {
        List<Offer> offers = new ArrayList<Offer>();
        offers.add(new Offer("Electronics", "Philips SHB3165 Wireless Headphones - Black.", new Date()));
        offers.add(new Offer("Clothing", "Batman Boys' Blue Novelty Pyjamas - 7-8 Years", new Date()));
        return ok(Json.toJson(offers));
    }
}
