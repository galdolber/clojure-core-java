package clojure;

import clojure.lang.*;

public class pprint__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.pprint_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_fn__7312()));
  }
  ((IFn)const__3.getRawRoot()).invoke("pprint/utilities");
  ((IFn)const__3.getRawRoot()).invoke("pprint/column_writer");
  ((IFn)const__3.getRawRoot()).invoke("pprint/pretty_writer");
  ((IFn)const__3.getRawRoot()).invoke("pprint/pprint_base");
  ((IFn)const__3.getRawRoot()).invoke("pprint/cl_format");
  ((IFn)const__3.getRawRoot()).invoke("pprint/dispatch");
  ((IFn)const__3.getRawRoot()).invoke("pprint/print_table");
 }
 private static clojure.lang.Var const__0;
 private static clojure.lang.Symbol const__1;
 private static clojure.lang.Symbol const__2;
 private static clojure.lang.Var const__3;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.pprint")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "added"), "1.2", Keyword.intern(null, "doc"), "A Pretty Printer for Clojure\n\nclojure.pprint implements a flexible system for printing structured data\nin a pleasing, easy-to-understand format. Basic use of the pretty printer is \nsimple, just call pprint instead of println. More advanced users can use \nthe building blocks provided to create custom output formats. \n\nOut of the box, pprint supports a simple structured format for basic data \nand a specialized format for Clojure source code. More advanced formats, \nincluding formats that don't look like Clojure data at all like XML and \nJSON, can be rendered by creating custom dispatch functions. \n\nIn addition to the pprint function, this module contains cl-format, a text \nformatting function which is fully compatible with the format function in \nCommon Lisp. Because pretty printing directives are directly integrated with\ncl-format, it supports very concise custom dispatch. It also provides\na more powerful alternative to Clojure's standard format function.\n\nSee documentation for pprint and cl-format for more information or \ncomplete documentation on the the clojure web site on github.", Keyword.intern(null, "author"), "Tom Faulhaber"));
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "load");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.pprint__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
