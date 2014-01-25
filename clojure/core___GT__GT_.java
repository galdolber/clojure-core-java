package clojure;

import clojure.lang.*;

public final class core___GT__GT_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public core___GT__GT_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object x3, java.lang.Object forms4) {
  {
   Object x5 = x3;
   Object forms6 = forms4;
   while(true) {
    Object __r2395 = forms6;
    if (__r2395 != null && !(__r2395 == Boolean.FALSE)) {
     {
      Object form7 = ((IFn)const__0.getRawRoot()).invoke(forms6);
      Object __r2396;
      Object __r2397 = ((IFn)const__1.getRawRoot()).invoke(form7);
      if (__r2397 != null && !(__r2397 == Boolean.FALSE)) {
       __r2396 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(form7)), ((IFn)const__6.getRawRoot()).invoke(form7), ((IFn)const__5.getRawRoot()).invoke(x5))), ((IFn)const__7.getRawRoot()).invoke(form7));
      } else {
       __r2396 = ((IFn)const__5.getRawRoot()).invoke(form7, x5);
      }
      Object threaded8 = __r2396;
      java.lang.Object x5___aux = threaded8;
      java.lang.Object forms6___aux = ((IFn)const__6.getRawRoot()).invoke(forms6);
      x5 = x5___aux;
      forms6 = forms6___aux;
      continue;
     }
    } else {
     return x5;
    }
   }
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
