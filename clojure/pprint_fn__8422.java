package clojure;

import clojure.lang.*;

public final class pprint_fn__8422 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
 }
 public pprint_fn__8422() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object format_in__8216__auto__1 = "~:<~1I~w~^ ~@_~w~@{ ~_~w~}~:>";
   Object __r6134;
   Object __r6135 = ((IFn)const__0.getRawRoot()).invoke(format_in__8216__auto__1);
   if (__r6135 != null && !(__r6135 == Boolean.FALSE)) {
    __r6134 = ((IFn)const__1).invoke(format_in__8216__auto__1);
   } else {
    __r6134 = format_in__8216__auto__1;
   }
   Object cf__8217__auto__2 = __r6134;
   return new clojure.pprint_fn__8422_fn__8423(cf__8217__auto__2);
  }
 }
}
