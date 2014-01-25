package clojure;

import clojure.lang.*;

public final class pprint_two_forms_iter__8463__8467_fn__8468_fn__8469 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 int size__4617__auto__5;
 Object b__84666;
 Object c__4616__auto__4;
 public pprint_two_forms_iter__8463__8467_fn__8468_fn__8469(final int size__4617__auto__5, final Object b__84666, final Object c__4616__auto__4) {
  super();
  this.size__4617__auto__5 = size__4617__auto__5;
  this.b__84666 = b__84666;
  this.c__4616__auto__4 = c__4616__auto__4;
 }
 public java.lang.Object invoke() {
  {
   long i__84651 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__84651, (long)size__4617__auto__5)) {
     {
      Object x2 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__84651)));
      ((IFn)const__3.getRawRoot()).invoke(this.b__84666, RT.vector(x2, RT.vector(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(x2))), ((IFn)const__7.getRawRoot()).invoke(x2))));
      long i__84651___aux = clojure.lang.Numbers.unchecked_inc((long)i__84651);
      i__84651 = i__84651___aux;
      continue;
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
