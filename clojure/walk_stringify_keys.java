package clojure;

import clojure.lang.*;

public final class walk_stringify_keys extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.walk", "postwalk");
 }
 public walk_stringify_keys() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   Object f2 = new clojure.walk_stringify_keys_f__6609();
   return ((IFn)const__0.getRawRoot()).invoke(new clojure.walk_stringify_keys_fn__6612(f2), m1);
  }
 }
}
