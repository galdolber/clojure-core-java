package clojure;

import clojure.lang.*;

public final class pprint_tuple_map_iter__7357__7361_fn__7362_fn__7363 extends clojure.lang.AFunction {
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
 Object c__4616__auto__4;
 Object b__73606;
 int size__4617__auto__5;
 Object v12;
 public pprint_tuple_map_iter__7357__7361_fn__7362_fn__7363(final Object c__4616__auto__4, final Object b__73606, final int size__4617__auto__5, final Object v12) {
  super();
  this.c__4616__auto__4 = c__4616__auto__4;
  this.b__73606 = b__73606;
  this.size__4617__auto__5 = size__4617__auto__5;
  this.v12 = v12;
 }
 public java.lang.Object invoke() {
  {
   long i__73591 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__73591, (long)size__4617__auto__5)) {
     {
      Object vec__73642 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__73591)));
      Object k3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73642), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object v4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73642), (int)RT.intCast(1L), ((java.lang.Object)null)));
      ((IFn)const__5.getRawRoot()).invoke(this.b__73606, RT.vector(k3, RT.vector(v4, this.v12)));
      long i__73591___aux = clojure.lang.Numbers.unchecked_inc((long)i__73591);
      i__73591 = i__73591___aux;
      continue;
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
