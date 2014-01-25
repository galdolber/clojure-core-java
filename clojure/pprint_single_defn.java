package clojure;

import clojure.lang.*;

public final class pprint_single_defn extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "cached-compile");
 }
 public pprint_single_defn() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1, java.lang.Object has_doc_str_QMARK_2) {
  Object __r6058 = ((IFn)const__0.getRawRoot()).invoke(alis1);
  if (__r6058 != null && !(__r6058 == Boolean.FALSE)) {
   Object __r6060 = has_doc_str_QMARK_2;
   if (__r6060 != null && !(__r6060 == Boolean.FALSE)) {
    Object __r6061 = null;
    {
     Object format_in__8216__auto__3 = " ~_";
     Object __r6062;
     Object __r6063 = ((IFn)const__1.getRawRoot()).invoke(format_in__8216__auto__3);
     if (__r6063 != null && !(__r6063 == Boolean.FALSE)) {
      __r6062 = ((IFn)const__2).invoke(format_in__8216__auto__3);
     } else {
      __r6062 = format_in__8216__auto__3;
     }
     Object cf__8217__auto__4 = __r6062;
     __r6061 = new clojure.pprint_single_defn_fn__8356(cf__8217__auto__4);
    }
    ((IFn)__r6061).invoke();
   } else {
    Object __r6064 = null;
    {
     Object format_in__8216__auto__5 = " ~@_";
     Object __r6065;
     Object __r6066 = ((IFn)const__1.getRawRoot()).invoke(format_in__8216__auto__5);
     if (__r6066 != null && !(__r6066 == Boolean.FALSE)) {
      __r6065 = ((IFn)const__2).invoke(format_in__8216__auto__5);
     } else {
      __r6065 = format_in__8216__auto__5;
     }
     Object cf__8217__auto__6 = __r6065;
     __r6064 = new clojure.pprint_single_defn_fn__8359(cf__8217__auto__6);
    }
    ((IFn)__r6064).invoke();
   }
   Object __r6067 = null;
   {
    Object format_in__8216__auto__7 = "~{~w~^ ~_~}";
    Object __r6068;
    Object __r6069 = ((IFn)const__1.getRawRoot()).invoke(format_in__8216__auto__7);
    if (__r6069 != null && !(__r6069 == Boolean.FALSE)) {
     __r6068 = ((IFn)const__2).invoke(format_in__8216__auto__7);
    } else {
     __r6068 = format_in__8216__auto__7;
    }
    Object cf__8217__auto__8 = __r6068;
    __r6067 = new clojure.pprint_single_defn_fn__8362(cf__8217__auto__8);
   }
   return ((IFn)__r6067).invoke(alis1);
  } else {
   return null;
  }
 }
}
