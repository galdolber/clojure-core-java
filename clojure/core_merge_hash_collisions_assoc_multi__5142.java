package clojure;

import clojure.lang.*;

public final class core_merge_hash_collisions_assoc_multi__5142 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "condp");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "=");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 Object expr_sym1;
 Object default2;
 public core_merge_hash_collisions_assoc_multi__5142(final Object expr_sym1, final Object default2) {
  super();
  this.expr_sym1 = expr_sym1;
  this.default2 = default2;
 }
 public java.lang.Object invoke(java.lang.Object m1, java.lang.Object h2, java.lang.Object bucket3) {
  {
   Object testexprs4 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), bucket3);
   Object expr5 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(const__5), ((IFn)const__3.getRawRoot()).invoke(this.expr_sym1), testexprs4, ((IFn)const__3.getRawRoot()).invoke(this.default2)));
   return ((IFn)const__6.getRawRoot()).invoke(m1, h2, expr5);
  }
 }
}
