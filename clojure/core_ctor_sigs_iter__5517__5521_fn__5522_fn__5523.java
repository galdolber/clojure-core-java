package clojure;

import clojure.lang.*;

public final class core_ctor_sigs_iter__5517__5521_fn__5522_fn__5523 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 int size__4617__auto__5;
 Object b__55206;
 Object c__4616__auto__4;
 public core_ctor_sigs_iter__5517__5521_fn__5522_fn__5523(final int size__4617__auto__5, final Object b__55206, final Object c__4616__auto__4) {
  super();
  this.size__4617__auto__5 = size__4617__auto__5;
  this.b__55206 = b__55206;
  this.c__4616__auto__4 = c__4616__auto__4;
 }
 public java.lang.Object invoke() {
  {
   long i__55191 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__55191, (long)size__4617__auto__5)) {
     {
      Object ctor2 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__55191)));
      Object __r3515 = ((IFn)const__3.getRawRoot()).invoke((java.lang.reflect.Modifier.isPrivate((int)((java.lang.reflect.Constructor)ctor2).getModifiers()) ? Boolean.TRUE : Boolean.FALSE));
      if (__r3515 != null && !(__r3515 == Boolean.FALSE)) {
       ((IFn)const__4.getRawRoot()).invoke(this.b__55206, ((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((java.lang.Class[])((java.lang.reflect.Constructor)ctor2).getParameterTypes())));
       long i__55191___aux = clojure.lang.Numbers.unchecked_inc((long)i__55191);
       i__55191 = i__55191___aux;
       continue;
      } else {
       long i__55191___aux = clojure.lang.Numbers.unchecked_inc((long)i__55191);
       i__55191 = i__55191___aux;
       continue;
      }
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
