package clojure;

import clojure.lang.*;

public final class core_list_STAR_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "spread");
 }
 public core_list_STAR_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3, java.lang.Object d4, java.lang.Object more5) {
  return ((IFn)const__1.getRawRoot()).invoke(a1, ((IFn)const__1.getRawRoot()).invoke(b2, ((IFn)const__1.getRawRoot()).invoke(c3, ((IFn)const__1.getRawRoot()).invoke(d4, ((IFn)const__2.getRawRoot()).invoke(more5)))));
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3, java.lang.Object args4) {
  return ((IFn)const__1.getRawRoot()).invoke(a1, ((IFn)const__1.getRawRoot()).invoke(b2, ((IFn)const__1.getRawRoot()).invoke(c3, args4)));
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object args3) {
  return ((IFn)const__1.getRawRoot()).invoke(a1, ((IFn)const__1.getRawRoot()).invoke(b2, args3));
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object args2) {
  return ((IFn)const__1.getRawRoot()).invoke(a1, args2);
 }
 public java.lang.Object invoke(java.lang.Object args1) {
  return ((IFn)const__0.getRawRoot()).invoke(args1);
 }
 public int getRequiredArity() {
  return 4;
 }
}
