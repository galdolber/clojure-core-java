package clojure;

import clojure.lang.*;

public final class pprint_map_params_iter__8139__8143_fn__8144_fn__8145 extends clojure.lang.AFunction {
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
 Object offset4;
 Object c__4616__auto__4;
 Object b__81426;
 public pprint_map_params_iter__8139__8143_fn__8144_fn__8145(final int size__4617__auto__5, final Object offset4, final Object c__4616__auto__4, final Object b__81426) {
  super();
  this.size__4617__auto__5 = size__4617__auto__5;
  this.offset4 = offset4;
  this.c__4616__auto__4 = c__4616__auto__4;
  this.b__81426 = b__81426;
 }
 public java.lang.Object invoke() {
  {
   long i__81411 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__81411, (long)size__4617__auto__5)) {
     {
      Object vec__81462 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__81411)));
      Object name3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81462), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object vec__81474 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81462), (int)RT.intCast(1L), ((java.lang.Object)null)));
      Object default5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81474), (int)RT.intCast(0L), ((java.lang.Object)null)));
      ((IFn)const__5.getRawRoot()).invoke(this.b__81426, RT.vector(name3, RT.vector(default5, this.offset4)));
      long i__81411___aux = clojure.lang.Numbers.unchecked_inc((long)i__81411);
      i__81411 = i__81411___aux;
      continue;
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
