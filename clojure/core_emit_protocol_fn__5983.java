package clojure;

import clojure.lang.*;

public final class core_emit_protocol_fn__5983 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "intern");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*ns*");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "with-meta");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "merge");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "protocol");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "emit-method-builder");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "on-interface");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "on");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
 }
 Object opts5;
 Object name1;
 public core_emit_protocol_fn__5983(final Object opts5, final Object name1) {
  super();
  this.opts5 = opts5;
  this.name1 = name1;
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return RT.vector(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__5), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__6), ((IFn)const__2.getRawRoot()).invoke(RT.get(s1, Keyword.intern(null, "name")))))), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__8), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__6), ((IFn)const__2.getRawRoot()).invoke(s1)))), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__11), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__12), ((IFn)const__2.getRawRoot()).invoke(this.name1)))))))))))))))), ((IFn)const__13.getRawRoot()).invoke(RT.get(this.opts5, Keyword.intern(null, "on-interface")), RT.get(s1, Keyword.intern(null, "name")), RT.get(s1, Keyword.intern(null, "on")), RT.get(s1, Keyword.intern(null, "arglists"))));
 }
}
