package clojure;

import clojure.lang.*;

public final class core__EQ_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public core__EQ_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object y2, java.lang.Object more3) {
  while(true) {
   if (clojure.lang.Util.equiv(((java.lang.Object)x1), ((java.lang.Object)y2))) {
    Object __r2335 = ((IFn)const__0.getRawRoot()).invoke(more3);
    if (__r2335 != null && !(__r2335 == Boolean.FALSE)) {
     java.lang.Object x1___aux = y2;
     java.lang.Object y2___aux = ((IFn)const__1.getRawRoot()).invoke(more3);
     java.lang.Object more3___aux = ((IFn)const__0.getRawRoot()).invoke(more3);
     x1 = x1___aux;
     y2 = y2___aux;
     more3 = more3___aux;
     continue;
    } else {
     return (clojure.lang.Util.equiv(((java.lang.Object)y2), ((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(more3))) ? Boolean.TRUE : Boolean.FALSE);
    }
   } else {
    return Boolean.FALSE;
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return (clojure.lang.Util.equiv(((java.lang.Object)x1), ((java.lang.Object)y2)) ? Boolean.TRUE : Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Boolean.TRUE;
 }
 public int getRequiredArity() {
  return 2;
 }
}
