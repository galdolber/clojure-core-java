package clojure;

import clojure.lang.*;

public final class pprint_multi_defn extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
 }
 public pprint_multi_defn() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1, java.lang.Object has_doc_str_QMARK_2) {
  Object __r6071 = ((IFn)const__0.getRawRoot()).invoke(alis1);
  if (__r6071 != null && !(__r6071 == Boolean.FALSE)) {
   Object __r6072 = null;
   {
    Object format_in__8216__auto__3 = " ~_~{~w~^ ~_~}";
    Object __r6073;
    Object __r6074 = ((IFn)const__1.getRawRoot()).invoke(format_in__8216__auto__3);
    if (__r6074 != null && !(__r6074 == Boolean.FALSE)) {
     __r6073 = ((IFn)const__2).invoke(format_in__8216__auto__3);
    } else {
     __r6073 = format_in__8216__auto__3;
    }
    Object cf__8217__auto__4 = __r6073;
    __r6072 = new clojure.pprint_multi_defn_fn__8372(cf__8217__auto__4);
   }
   return ((IFn)__r6072).invoke(alis1);
  } else {
   return null;
  }
 }
}
