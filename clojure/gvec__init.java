package clojure;

import clojure.lang.*;

public class gvec__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.core_fn__6143()).invoke();
  const__2.setMeta((IPersistentMap)const__8);
  const__2.bindRoot(new clojure.core.VecNode(((java.lang.Object)null), ((java.lang.Object)((java.lang.Object[])clojure.lang.RT.object_array(((java.lang.Object)const__10))))));
  ((IFn)new clojure.core_fn__6148()).invoke();
  ((IFn)new clojure.core_fn__6150()).invoke();
  ((IFn)new clojure.core_fn__6152()).invoke();
  ((IFn)new clojure.core_fn__6157()).invoke();
  ((clojure.lang.MultiFn)const__11.getRawRoot()).addMethod(((java.lang.Object)const__12), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_fn__6168()));
  ((IFn)new clojure.core_fn__6172()).invoke();
  ((clojure.lang.MultiFn)const__11.getRawRoot()).addMethod(((java.lang.Object)const__13), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_fn__6202()));
  const__14.setMeta((IPersistentMap)const__19);
  const__14.bindRoot(new clojure.core_mk_am());
  ((clojure.lang.Var)const__14).setMacro();
  const__20.setMeta((IPersistentMap)const__22);
  const__20.bindRoot(RT.mapUniqueKeys(const__23, new clojure.core_reify__6209(), const__24, new clojure.core_reify__6212(), const__25, new clojure.core_reify__6215(), const__26, new clojure.core_reify__6218(), const__27, new clojure.core_reify__6221(), const__28, new clojure.core_reify__6224(), const__29, new clojure.core_reify__6227(), const__30, new clojure.core_reify__6230()));
  const__31.setMeta((IPersistentMap)const__36);
  const__31.bindRoot(new clojure.core_vector_of());
 }
 private static clojure.lang.Var const__0;
 private static clojure.lang.Symbol const__1;
 private static clojure.lang.Var const__2;
 private static clojure.lang.Keyword const__3;
 private static clojure.lang.Keyword const__4;
 private static java.lang.Integer const__5;
 private static clojure.lang.Keyword const__6;
 private static java.lang.Integer const__7;
 private static clojure.lang.IPersistentMap const__8;
 private static clojure.lang.Var const__9;
 private static java.lang.Long const__10;
 private static clojure.lang.Var const__11;
 private static clojure.lang.Keyword const__12;
 private static clojure.lang.Keyword const__13;
 private static clojure.lang.Var const__14;
 private static java.lang.Integer const__15;
 private static clojure.lang.Keyword const__16;
 private static clojure.lang.IPersistentList const__17;
 private static clojure.lang.Keyword const__18;
 private static clojure.lang.IPersistentMap const__19;
 private static clojure.lang.Var const__20;
 private static java.lang.Integer const__21;
 private static clojure.lang.IPersistentMap const__22;
 private static clojure.lang.Keyword const__23;
 private static clojure.lang.Keyword const__24;
 private static clojure.lang.Keyword const__25;
 private static clojure.lang.Keyword const__26;
 private static clojure.lang.Keyword const__27;
 private static clojure.lang.Keyword const__28;
 private static clojure.lang.Keyword const__29;
 private static clojure.lang.Keyword const__30;
 private static clojure.lang.Var const__31;
 private static java.lang.Integer const__32;
 private static clojure.lang.IPersistentList const__33;
 private static clojure.lang.Keyword const__34;
 private static clojure.lang.Keyword const__35;
 private static clojure.lang.IPersistentMap const__36;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "EMPTY-NODE");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__5 = (java.lang.Integer)1;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__7 = (java.lang.Integer)17;
  const__8 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 17, Keyword.intern(null, "file"), "clojure/gvec.clj");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "object-array");
  const__10 = (java.lang.Long)32L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "print-method");
  const__12 = (clojure.lang.Keyword)Keyword.intern("clojure.core", "VecSeq");
  const__13 = (clojure.lang.Keyword)Keyword.intern("clojure.core", "Vec");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "mk-am");
  const__15 = (java.lang.Integer)432;
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__17 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "t"))));
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__19 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "t")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 432, Keyword.intern(null, "file"), "clojure/gvec.clj");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "ams");
  const__21 = (java.lang.Integer)442;
  const__22 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 442, Keyword.intern(null, "file"), "clojure/gvec.clj");
  const__23 = (clojure.lang.Keyword)Keyword.intern(null, "int");
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "long");
  const__25 = (clojure.lang.Keyword)Keyword.intern(null, "float");
  const__26 = (clojure.lang.Keyword)Keyword.intern(null, "double");
  const__27 = (clojure.lang.Keyword)Keyword.intern(null, "byte");
  const__28 = (clojure.lang.Keyword)Keyword.intern(null, "short");
  const__29 = (clojure.lang.Keyword)Keyword.intern(null, "char");
  const__30 = (clojure.lang.Keyword)Keyword.intern(null, "boolean");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "vector-of");
  const__32 = (java.lang.Integer)452;
  const__33 = (clojure.lang.IPersistentList)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "t")), RT.vector(Symbol.intern(null, "t"), Symbol.intern(null, "&"), Symbol.intern(null, "elements"))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 460, Keyword.intern(null, "column"), 15));
  const__34 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__35 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__36 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "t")), RT.vector(Symbol.intern(null, "t"), Symbol.intern(null, "&"), Symbol.intern(null, "elements"))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 460, Keyword.intern(null, "column"), 15)), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.2", Keyword.intern(null, "doc"), "Creates a new vector of a single primitive type t, where t is one\n  of :int :long :float :double :byte :short :char or :boolean. The\n  resulting vector complies with the interface of vectors in general,\n  but stores the values unboxed internally.\n\n  Optionally takes one or more elements to populate the vector.", Keyword.intern(null, "line"), 452, Keyword.intern(null, "file"), "clojure/gvec.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.gvec__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
