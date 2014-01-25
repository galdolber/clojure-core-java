package clojure;

import clojure.lang.*;

public final class pprint_tuple_map extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "into");
 }
 public pprint_tuple_map() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object v12) {
  Object __r4822 = null;
  {
   Object iter__4618__auto__3 = new clojure.pprint_tuple_map_iter__7357__7361(v12);
   __r4822 = ((IFn)iter__4618__auto__3).invoke(m1);
  }
  return ((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, __r4822);
 }
}
