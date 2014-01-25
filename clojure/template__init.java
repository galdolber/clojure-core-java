package clojure;

import clojure.lang.*;

public class template__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.template_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.template_fn__7071()));
  }
  const__3.setMeta((IPersistentMap)const__12);
  const__3.bindRoot(new clojure.template_apply_template());
  const__13.setMeta((IPersistentMap)const__16);
  const__13.bindRoot(new clojure.template_do_template());
  ((clojure.lang.Var)const__13).setMacro();
 }
 private static clojure.lang.Var const__0;
 private static clojure.lang.Symbol const__1;
 private static clojure.lang.Symbol const__2;
 private static clojure.lang.Var const__3;
 private static clojure.lang.Keyword const__4;
 private static clojure.lang.Keyword const__5;
 private static java.lang.Integer const__6;
 private static clojure.lang.Keyword const__7;
 private static java.lang.Integer const__8;
 private static clojure.lang.Keyword const__9;
 private static clojure.lang.IPersistentList const__10;
 private static clojure.lang.Keyword const__11;
 private static clojure.lang.IPersistentMap const__12;
 private static clojure.lang.Var const__13;
 private static java.lang.Integer const__14;
 private static clojure.lang.IPersistentList const__15;
 private static clojure.lang.IPersistentMap const__16;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.template")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Stuart Sierra", Keyword.intern(null, "doc"), "Macros that expand to repeated copies of a template expression."));
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.template", "apply-template");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__6 = (java.lang.Integer)1;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__8 = (java.lang.Integer)29;
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__10 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "argv"), Symbol.intern(null, "expr"), Symbol.intern(null, "values"))));
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__12 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "argv"), Symbol.intern(null, "expr"), Symbol.intern(null, "values")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "doc"), "For use in macros.  argv is an argument list, as in defn.  expr is\n  a quoted expression using the symbols in argv.  values is a sequence\n  of values to be used for the arguments.\n\n  apply-template will recursively replace argument symbols in expr\n  with their corresponding values, returning a modified expr.\n\n  Example: (apply-template '[x] '(+ x x) '[2])\n  ;=> (+ 2 2)", Keyword.intern(null, "line"), 29, Keyword.intern(null, "file"), "clojure/template.clj");
  const__13 = (clojure.lang.Var)RT.var("clojure.template", "do-template");
  const__14 = (java.lang.Integer)44;
  const__15 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "argv"), Symbol.intern(null, "expr"), Symbol.intern(null, "&"), Symbol.intern(null, "values"))));
  const__16 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "argv"), Symbol.intern(null, "expr"), Symbol.intern(null, "&"), Symbol.intern(null, "values")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "doc"), "Repeatedly copies expr (in a do block) for each group of arguments\n  in values.  values are automatically partitioned by the number of\n  arguments in argv, an argument vector as in defn.\n\n  Example: (macroexpand '(do-template [x y] (+ y x) 2 4 3 5))\n  ;=> (do (+ 4 2) (+ 5 3))", Keyword.intern(null, "line"), 44, Keyword.intern(null, "file"), "clojure/template.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.template__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
