package clojure;

import clojure.lang.*;

public final class pprint_unzip_map_iter__7320__7324_fn__7325_fn__7326 extends clojure.lang.AFunction {
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
 int size__4617__auto__5;
 Object b__73236;
 Object c__4616__auto__4;
 public pprint_unzip_map_iter__7320__7324_fn__7325_fn__7326(final int size__4617__auto__5, final Object b__73236, final Object c__4616__auto__4) {
  super();
  this.size__4617__auto__5 = size__4617__auto__5;
  this.b__73236 = b__73236;
  this.c__4616__auto__4 = c__4616__auto__4;
 }
 public java.lang.Object invoke() {
  {
   long i__73221 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__73221, (long)size__4617__auto__5)) {
     {
      Object vec__73272 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__73221)));
      Object k3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73272), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object vec__73284 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73272), (int)RT.intCast(1L), ((java.lang.Object)null)));
      Object v15 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73284), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object v26 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73284), (int)RT.intCast(1L), ((java.lang.Object)null)));
      ((IFn)const__5.getRawRoot()).invoke(this.b__73236, RT.vector(k3, v15));
      long i__73221___aux = clojure.lang.Numbers.unchecked_inc((long)i__73221);
      i__73221 = i__73221___aux;
      continue;
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
