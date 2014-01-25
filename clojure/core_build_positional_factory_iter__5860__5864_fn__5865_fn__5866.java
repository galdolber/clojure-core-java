package clojure;

import clojure.lang.*;

public final class core_build_positional_factory_iter__5860__5864_fn__5865_fn__5866 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "nth");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "overage");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 Object c__4616__auto__4;
 int size__4617__auto__5;
 Object b__58636;
 public core_build_positional_factory_iter__5860__5864_fn__5865_fn__5866(final Object c__4616__auto__4, final int size__4617__auto__5, final Object b__58636) {
  super();
  this.c__4616__auto__4 = c__4616__auto__4;
  this.size__4617__auto__5 = size__4617__auto__5;
  this.b__58636 = b__58636;
 }
 public java.lang.Object invoke() {
  {
   long i__58621 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__58621, (long)size__4617__auto__5)) {
     {
      Object i2 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__58621)));
      ((IFn)const__3.getRawRoot()).invoke(this.b__58636, ((IFn)const__4.getRawRoot()).invoke(const__5, const__6, i2));
      long i__58621___aux = clojure.lang.Numbers.unchecked_inc((long)i__58621);
      i__58621 = i__58621___aux;
      continue;
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
