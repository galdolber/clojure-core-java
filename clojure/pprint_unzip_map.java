package clojure;

import clojure.lang.*;

public final class pprint_unzip_map extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "into");
 }
 public pprint_unzip_map() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  Object __r4813 = null;
  {
   Object iter__4618__auto__2 = new clojure.pprint_unzip_map_iter__7320__7324();
   __r4813 = ((IFn)iter__4618__auto__2).invoke(m1);
  }
  Object __r4814 = null;
  {
   Object iter__4618__auto__3 = new clojure.pprint_unzip_map_iter__7337__7341();
   __r4814 = ((IFn)iter__4618__auto__3).invoke(m1);
  }
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, __r4813), ((IFn)const__0.getRawRoot()).invoke(clojure.lang.PersistentArrayMap.EMPTY, __r4814));
 }
}
