package clojure;

import clojure.lang.*;

public final class set_superset_QMARK_ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", ">=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "every?");
 }
 public set_superset_QMARK_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object set11, java.lang.Object set22) {
  {
   boolean and__3966__auto__3 = clojure.lang.Numbers.gte((long)clojure.lang.RT.count(((java.lang.Object)set11)), (long)clojure.lang.RT.count(((java.lang.Object)set22)));
   if (and__3966__auto__3) {
    return ((IFn)const__2.getRawRoot()).invoke(new clojure.set_superset_QMARK__fn__6913(set11), set22);
   } else {
    return (and__3966__auto__3 ? Boolean.TRUE : Boolean.FALSE);
   }
  }
 }
}
