package clojure;

import clojure.lang.*;

public final class pprint_pprint_code_list extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-reader-macro");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*code-table*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-simple-code-list");
 }
 public pprint_pprint_code_list() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alis1) {
  Object __r6203 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(alis1));
  if (__r6203 != null && !(__r6203 == Boolean.FALSE)) {
   {
    Object temp__4115__auto__2 = ((IFn)const__2.get()).invoke(((IFn)const__3.getRawRoot()).invoke(alis1));
    Object __r6205 = temp__4115__auto__2;
    if (__r6205 != null && !(__r6205 == Boolean.FALSE)) {
     {
      Object special_form3 = temp__4115__auto__2;
      return ((IFn)special_form3).invoke(alis1);
     }
    } else {
     return ((IFn)const__4.getRawRoot()).invoke(alis1);
    }
   }
  } else {
   return null;
  }
 }
}
