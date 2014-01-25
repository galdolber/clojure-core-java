package clojure;

import clojure.lang.*;

public final class pprint_two_forms extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "identity");
 }
 public pprint_two_forms() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object amap1) {
  Object __r6196 = null;
  {
   Object iter__4618__auto__2 = new clojure.pprint_two_forms_iter__8463__8467();
   __r6196 = ((IFn)iter__4618__auto__2).invoke(amap1);
  }
  return ((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), __r6196));
 }
}
