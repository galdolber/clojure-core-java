package clojure;

import clojure.lang.*;

public class stacktrace__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.stacktrace_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.stacktrace_fn__7051()));
  }
  const__3.setMeta((IPersistentMap)const__13);
  const__3.bindRoot(new clojure.stacktrace_root_cause());
  const__14.setMeta((IPersistentMap)const__17);
  const__14.bindRoot(new clojure.stacktrace_print_trace_element());
  const__18.setMeta((IPersistentMap)const__21);
  const__18.bindRoot(new clojure.stacktrace_print_throwable());
  const__22.setMeta((IPersistentMap)const__25);
  const__22.bindRoot(new clojure.stacktrace_print_stack_trace());
  const__26.setMeta((IPersistentMap)const__29);
  const__26.bindRoot(new clojure.stacktrace_print_cause_trace());
  const__30.setMeta((IPersistentMap)const__33);
  const__30.bindRoot(new clojure.stacktrace_e());
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
 private static java.lang.Integer const__27;
 private static clojure.lang.IPersistentList const__28;
 private static clojure.lang.IPersistentMap const__29;
 private static clojure.lang.Var const__30;
 private static java.lang.Integer const__31;
 private static clojure.lang.IPersistentList const__32;
 private static clojure.lang.IPersistentMap const__33;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.stacktrace")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Stuart Sierra", Keyword.intern(null, "doc"), "Print stack traces oriented towards Clojure, not Java."));
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.stacktrace", "root-cause");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__6 = (java.lang.Integer)1;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__8 = (java.lang.Integer)18;
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__10 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable"))))));
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__13 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable")))))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Returns the last 'cause' Throwable in a chain of Throwables.", Keyword.intern(null, "line"), 18, Keyword.intern(null, "file"), "clojure/stacktrace.clj");
  const__14 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-trace-element");
  const__15 = (java.lang.Integer)26;
  const__16 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "e")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "StackTraceElement"))))));
  const__17 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "e")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "StackTraceElement")))))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Prints a Clojure-oriented view of one element in a stack trace.", Keyword.intern(null, "line"), 26, Keyword.intern(null, "file"), "clojure/stacktrace.clj");
  const__18 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-throwable");
  const__19 = (java.lang.Integer)38;
  const__20 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable"))))));
  const__21 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable")))))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Prints the class and message of a Throwable.", Keyword.intern(null, "line"), 38, Keyword.intern(null, "file"), "clojure/stacktrace.clj");
  const__22 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-stack-trace");
  const__23 = (java.lang.Integer)44;
  const__24 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "tr")), RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable"))), Symbol.intern(null, "n"))));
  const__25 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "tr")), RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable"))), Symbol.intern(null, "n")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Prints a Clojure-oriented stack trace of tr, a Throwable.\n  Prints a maximum of n stack frames (default: unlimited).\n  Does not print chained exceptions (causes).", Keyword.intern(null, "line"), 44, Keyword.intern(null, "file"), "clojure/stacktrace.clj");
  const__26 = (clojure.lang.Var)RT.var("clojure.stacktrace", "print-cause-trace");
  const__27 = (java.lang.Integer)66;
  const__28 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable")))), RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable"))), Symbol.intern(null, "n"))));
  const__29 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable")))), RT.vector(((clojure.lang.IObj)Symbol.intern(null, "tr")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Throwable"))), Symbol.intern(null, "n")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Like print-stack-trace but prints chained exceptions (causes).", Keyword.intern(null, "line"), 66, Keyword.intern(null, "file"), "clojure/stacktrace.clj");
  const__30 = (clojure.lang.Var)RT.var("clojure.stacktrace", "e");
  const__31 = (java.lang.Integer)76;
  const__32 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector()));
  const__33 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector())), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "REPL utility.  Prints a brief stack trace for the root cause of the\n  most recent exception.", Keyword.intern(null, "line"), 76, Keyword.intern(null, "file"), "clojure/stacktrace.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.stacktrace__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
