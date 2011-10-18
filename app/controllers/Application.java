package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
      List things = Thing.find("order by id desc").fetch();
      render(things);
    }

}