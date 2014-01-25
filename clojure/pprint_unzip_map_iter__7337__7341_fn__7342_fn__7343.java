package clojure;

import clojure.lang.*;

public final class pprint_unzip_map_iter__7337__7341_fn__7342_fn__7343 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 Object b__73406;
 Object c__4616__auto__4;
 int size__4617__auto__5;
 public pprint_unzip_map_iter__7337__7341_fn__7342_fn__7343(final Object b__73406, final Object c__4616__auto__4, final int size__4617__auto__5) {
  super();
  this.b__73406 = b__73406;
  this.c__4616__auto__4 = c__4616__auto__4;
  this.size__4617__auto__5 = size__4617__auto__5;
 }
 public java.lang.Object invoke() {
  {
   long i__73391 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__73391, (long)size__4617__auto__5)) {
     {
      Object vec__73442 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__73391)));
      Object k3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73442), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object vec__73454 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73442), (int)RT.intCast(1L), ((java.lang.Object)null)));
      Object v15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73454), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object v26 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73454), (int)RT.intCast(1L), ((java.lang.Object)null)));
      ((IFn)const__5.getRawRoot()).invoke(this.b__73406, RT.vector(k3, v26));
      long i__73391___aux = clojure.lang.Numbers.unchecked_inc((long)i__73391);
      i__73391 = i__73391___aux;
      continue;
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
