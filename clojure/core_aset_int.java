package clojure;

import clojure.lang.*;

public final class core_aset_int extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "aset-int");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "aget");
 }
 public core_aset_int() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object array__4479__auto__1, java.lang.Object idx__4480__auto__2, java.lang.Object idx2__4482__auto__3, java.lang.Object idxv__4483__auto__4) {
  return ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), Reflector.invokeStaticMethod(clojure.lang.RT.class, "aget", new Object[]{array__4479__auto__1, Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)idx__4480__auto__2)))}), idx2__4482__auto__3, idxv__4483__auto__4);
 }
 public java.lang.Object invoke(java.lang.Object array__4479__auto__1, java.lang.Object idx__4480__auto__2, java.lang.Object val__4481__auto__3) {
  java.lang.reflect.Array.setInt(((java.lang.Object)array__4479__auto__1), (int)RT.intCast(idx__4480__auto__2), (int)clojure.lang.RT.intCast(((java.lang.Object)val__4481__auto__3)));
  return val__4481__auto__3;
 }
 public int getRequiredArity() {
  return 3;
 }
}
