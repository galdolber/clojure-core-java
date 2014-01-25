package clojure;

import clojure.lang.*;

public final class core_find_keyword extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "string?");
 }
 public core_find_keyword() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1, java.lang.Object name2) {
  return ((clojure.lang.Keyword)clojure.lang.Keyword.find((java.lang.String)((java.lang.String)ns1), (java.lang.String)((java.lang.String)name2)));
 }
 public java.lang.Object invoke(java.lang.Object name1) {
  Object __r2313 = ((IFn)const__0.getRawRoot()).invoke(name1);
  if (__r2313 != null && !(__r2313 == Boolean.FALSE)) {
   return name1;
  } else {
   Object __r2315 = ((IFn)const__1.getRawRoot()).invoke(name1);
   if (__r2315 != null && !(__r2315 == Boolean.FALSE)) {
    return ((clojure.lang.Keyword)clojure.lang.Keyword.find((clojure.lang.Symbol)((clojure.lang.Symbol)name1)));
   } else {
    Object __r2317 = ((IFn)const__2.getRawRoot()).invoke(name1);
    if (__r2317 != null && !(__r2317 == Boolean.FALSE)) {
     return ((clojure.lang.Keyword)clojure.lang.Keyword.find((java.lang.String)((java.lang.String)name1)));
    } else {
     return null;
    }
   }
  }
 }
}
