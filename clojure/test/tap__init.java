package clojure.test;

import clojure.lang.*;

public class tap__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.test.tap_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.test.tap_fn__7215()));
  }
  const__3.setMeta((IPersistentMap)const__13);
  const__3.bindRoot(new clojure.test.tap_print_tap_plan());
  const__14.setMeta((IPersistentMap)const__17);
  const__14.bindRoot(new clojure.test.tap_print_tap_diagnostic());
  const__18.setMeta((IPersistentMap)const__21);
  const__18.bindRoot(new clojure.test.tap_print_tap_pass());
  const__22.setMeta((IPersistentMap)const__25);
  const__22.bindRoot(new clojure.test.tap_print_tap_fail());
  ((IFn)new clojure.test.tap_fn__7227()).invoke();
  ((clojure.lang.MultiFn)const__26.get()).addMethod(((java.lang.Object)const__27), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.test.tap_fn__7231()));
  const__28.setMeta((IPersistentMap)const__31);
  const__28.bindRoot(new clojure.test.tap_print_diagnostics());
  ((clojure.lang.MultiFn)const__26.get()).addMethod(((java.lang.Object)const__32), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.test.tap_fn__7237()));
  ((clojure.lang.MultiFn)const__26.get()).addMethod(((java.lang.Object)const__33), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.test.tap_fn__7239()));
  ((clojure.lang.MultiFn)const__26.get()).addMethod(((java.lang.Object)const__34), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.test.tap_fn__7241()));
  ((clojure.lang.MultiFn)const__26.get()).addMethod(((java.lang.Object)const__35), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.test.tap_fn__7243()));
  const__36.setMeta((IPersistentMap)const__39);
  const__36.bindRoot(new clojure.test.tap_with_tap_output());
  ((clojure.lang.Var)const__36).setMacro();
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
 private static clojure.lang.Keyword const__12;
 private static clojure.lang.IPersistentMap const__13;
 private static clojure.lang.Var const__14;
 private static java.lang.Integer const__15;
 private static clojure.lang.IPersistentList const__16;
 private static clojure.lang.IPersistentMap const__17;
 private static clojure.lang.Var const__18;
 private static java.lang.Integer const__19;
 private static clojure.lang.IPersistentList const__20;
 private static clojure.lang.IPersistentMap const__21;
 private static clojure.lang.Var const__22;
 private static java.lang.Integer const__23;
 private static clojure.lang.IPersistentList const__24;
 private static clojure.lang.IPersistentMap const__25;
 private static clojure.lang.Var const__26;
 private static clojure.lang.Keyword const__27;
 private static clojure.lang.Var const__28;
 private static java.lang.Integer const__29;
 private static clojure.lang.IPersistentList const__30;
 private static clojure.lang.IPersistentMap const__31;
 private static clojure.lang.Keyword const__32;
 private static clojure.lang.Keyword const__33;
 private static clojure.lang.Keyword const__34;
 private static clojure.lang.Keyword const__35;
 private static clojure.lang.Var const__36;
 private static java.lang.Integer const__37;
 private static clojure.lang.IPersistentList const__38;
 private static clojure.lang.IPersistentMap const__39;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.test.tap")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Stuart Sierra", Keyword.intern(null, "doc"), "clojure.test extensions for the Test Anything Protocol (TAP)\n\n  TAP is a simple text-based syntax for reporting test results.  TAP\n  was originally developed for Perl, and now has implementations in\n  several languages.  For more information on TAP, see\n  http://testanything.org/ and\n  http://search.cpan.org/~petdance/TAP-1.0.0/TAP.pm\n\n  To use this library, wrap any calls to\n  clojure.test/run-tests in the with-tap-output macro,\n  like this:\n\n    (use 'clojure.test)\n    (use 'clojure.test.tap)\n\n    (with-tap-output\n     (run-tests 'my.cool.library))"));
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-tap-plan");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__6 = (java.lang.Integer)1;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__8 = (java.lang.Integer)45;
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__10 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "n"))));
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__13 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "n")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Prints a TAP plan line like '1..n'.  n is the number of tests", Keyword.intern(null, "line"), 45, Keyword.intern(null, "file"), "clojure/test/tap.clj");
  const__14 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-tap-diagnostic");
  const__15 = (java.lang.Integer)51;
  const__16 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "data"))));
  const__17 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "data")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Prints a TAP diagnostic line.  data is a (possibly multi-line)\n  string.", Keyword.intern(null, "line"), 51, Keyword.intern(null, "file"), "clojure/test/tap.clj");
  const__18 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-tap-pass");
  const__19 = (java.lang.Integer)59;
  const__20 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "msg"))));
  const__21 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "msg")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Prints a TAP 'ok' line.  msg is a string, with no line breaks", Keyword.intern(null, "line"), 59, Keyword.intern(null, "file"), "clojure/test/tap.clj");
  const__22 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-tap-fail");
  const__23 = (java.lang.Integer)65;
  const__24 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "msg"))));
  const__25 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "msg")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Prints a TAP 'not ok' line.  msg is a string, with no line breaks", Keyword.intern(null, "line"), 65, Keyword.intern(null, "file"), "clojure/test/tap.clj");
  const__26 = (clojure.lang.Var)RT.var("clojure.test.tap", "tap-report");
  const__27 = (clojure.lang.Keyword)Keyword.intern(null, "default");
  const__28 = (clojure.lang.Var)RT.var("clojure.test.tap", "print-diagnostics");
  const__29 = (java.lang.Integer)78;
  const__30 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "data"))));
  const__31 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "data")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 78, Keyword.intern(null, "file"), "clojure/test/tap.clj");
  const__32 = (clojure.lang.Keyword)Keyword.intern(null, "pass");
  const__33 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__34 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
  const__35 = (clojure.lang.Keyword)Keyword.intern(null, "summary");
  const__36 = (clojure.lang.Var)RT.var("clojure.test.tap", "with-tap-output");
  const__37 = (java.lang.Integer)117;
  const__38 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "&"), Symbol.intern(null, "body"))));
  const__39 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "&"), Symbol.intern(null, "body")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Execute body with modified test reporting functions that produce\n  TAP output", Keyword.intern(null, "line"), 117, Keyword.intern(null, "file"), "clojure/test/tap.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.test.tap__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
