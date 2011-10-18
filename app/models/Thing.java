package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Thing extends Model {
  public String title;
  public boolean bought;
  
  public Thing(String title) {
    this.title = title;
  }
}