package clojure;

import clojure.lang.*;

public final class pprint_fn__8049 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "at");
 }
 public pprint_fn__8049() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object offset2) {
  Object __r5677 = RT.get(params1, Keyword.intern(null, "at"));
  if (__r5677 != null && !(__r5677 == Boolean.FALSE)) {
   return new clojure.pprint_fn__8049_fn__8050();
  } else {
   return new clojure.pprint_fn__8049_fn__8052();
  }
 }
}
