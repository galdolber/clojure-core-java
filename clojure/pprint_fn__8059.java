package clojure;

import clojure.lang.*;

public final class pprint_fn__8059 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "at");
 }
 public pprint_fn__8059() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object offset2) {
  Object __r5683 = RT.get(params1, Keyword.intern(null, "at"));
  if (__r5683 != null && !(__r5683 == Boolean.FALSE)) {
   return new clojure.pprint_fn__8059_fn__8060();
  } else {
   return new clojure.pprint_fn__8059_fn__8063();
  }
 }
}
