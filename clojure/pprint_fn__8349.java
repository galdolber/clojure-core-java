package clojure;

import clojure.lang.*;

public final class pprint_fn__8349 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
 }
 public pprint_fn__8349() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object format_in__8216__auto__1 = "~:<~w~^ ~@_~w~^ ~_~@{~w~^ ~_~}~:>";
   Object __r6055;
   Object __r6056 = ((IFn)const__0.getRawRoot()).invoke(format_in__8216__auto__1);
   if (__r6056 != null && !(__r6056 == Boolean.FALSE)) {
    __r6055 = ((IFn)const__1).invoke(format_in__8216__auto__1);
   } else {
    __r6055 = format_in__8216__auto__1;
   }
   Object cf__8217__auto__2 = __r6055;
   return new clojure.pprint_fn__8349_fn__8350(cf__8217__auto__2);
  }
 }
}
