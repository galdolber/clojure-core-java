package clojure;

import clojure.lang.*;

public final class core_emit_method_builder_fn__5926 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object on_method3;
 Object on_interface1;
 Object method2;
 public core_emit_method_builder_fn__5926(final Object on_method3, final Object on_interface1, final Object method2) {
  super();
  this.on_method3 = on_method3;
  this.on_interface1 = on_interface1;
  this.method2 = method2;
 }
 public java.lang.Object invoke(java.lang.Object args1) {
  {
   Object gargs2 = ((IFn)const__0.getRawRoot()).invoke(new clojure.core_emit_method_builder_fn__5926_fn__5927(), args1);
   Object target3 = ((IFn)const__1.getRawRoot()).invoke(gargs2);
   Object __r3770 = null;
   {
    Object or__3968__auto__4 = this.on_method3;
    Object __r3771;
    Object __r3772 = or__3968__auto__4;
    if (__r3772 != null && !(__r3772 == Boolean.FALSE)) {
     __r3771 = or__3968__auto__4;
    } else {
     __r3771 = this.method2;
    }
    __r3770 = __r3771;
   }
   return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(gargs2)))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__7), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(target3, RT.mapUniqueKeys(const__9, this.on_interface1))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(__r3770), ((IFn)const__10.getRawRoot()).invoke(gargs2)))))))));
  }
 }
}
