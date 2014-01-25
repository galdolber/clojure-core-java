package clojure;

import clojure.lang.*;

public final class pprint_fn__8265 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
 }
 public pprint_fn__8265() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object format_in__8216__auto__1 = "~<<-(~;~@{~w~^ ~_~}~;)-<~:>";
   Object __r5963;
   Object __r5964 = ((IFn)const__0.getRawRoot()).invoke(format_in__8216__auto__1);
   if (__r5964 != null && !(__r5964 == Boolean.FALSE)) {
    __r5963 = ((IFn)const__1).invoke(format_in__8216__auto__1);
   } else {
    __r5963 = format_in__8216__auto__1;
   }
   Object cf__8217__auto__2 = __r5963;
   return new clojure.pprint_fn__8265_fn__8266(cf__8217__auto__2);
  }
 }
}
