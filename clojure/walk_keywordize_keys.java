package clojure;

import clojure.lang.*;

public final class walk_keywordize_keys extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.walk", "postwalk");
 }
 public walk_keywordize_keys() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  {
   Object f2 = new clojure.walk_keywordize_keys_f__6602();
   return ((IFn)const__0.getRawRoot()).invoke(new clojure.walk_keywordize_keys_fn__6605(f2), m1);
  }
 }
}
