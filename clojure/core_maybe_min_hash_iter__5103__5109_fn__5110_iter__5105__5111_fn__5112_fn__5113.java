package clojure;

import clojure.lang.*;

public final class core_maybe_min_hash_iter__5103__5109_fn__5110_iter__5105__5111_fn__5112_fn__5113 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 Object mask4;
 Object c__4616__auto__4;
 Object b__51086;
 int size__4617__auto__5;
 public core_maybe_min_hash_iter__5103__5109_fn__5110_iter__5105__5111_fn__5112_fn__5113(final Object mask4, final Object c__4616__auto__4, final Object b__51086, final int size__4617__auto__5) {
  super();
  this.mask4 = mask4;
  this.c__4616__auto__4 = c__4616__auto__4;
  this.b__51086 = b__51086;
  this.size__4617__auto__5 = size__4617__auto__5;
 }
 public java.lang.Object invoke() {
  {
   long i__51071 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__51071, (long)size__4617__auto__5)) {
     {
      Object shift2 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__51071)));
      ((IFn)const__3.getRawRoot()).invoke(this.b__51086, RT.vector(shift2, this.mask4));
      long i__51071___aux = clojure.lang.Numbers.unchecked_inc((long)i__51071);
      i__51071 = i__51071___aux;
      continue;
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
