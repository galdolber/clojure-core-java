package clojure;

import clojure.lang.*;

public final class pprint_fn__8235 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
 }
 public pprint_fn__8235() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object format_in__8216__auto__1 = "~<[~;~@{~w~^, ~:_~}~;]~:>";
   Object __r5923;
   Object __r5924 = ((IFn)const__0.getRawRoot()).invoke(format_in__8216__auto__1);
   if (__r5924 != null && !(__r5924 == Boolean.FALSE)) {
    __r5923 = ((IFn)const__1).invoke(format_in__8216__auto__1);
   } else {
    __r5923 = format_in__8216__auto__1;
   }
   Object cf__8217__auto__2 = __r5923;
   return new clojure.pprint_fn__8235_fn__8236(cf__8217__auto__2);
  }
 }
}
