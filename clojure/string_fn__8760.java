package clojure;

import clojure.lang.*;

public final class string_fn__8760 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "commute");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*loaded-libs*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.string")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Stuart Sierra, Stuart Halloway, David Liebke", Keyword.intern(null, "doc"), "Clojure String utilities\n\nIt is poor form to (:use clojure.string). Instead, use require\nwith :as to specify a prefix, e.g.\n\n(ns your.namespace.here\n  (:require [clojure.string :as str]))\n\nDesign notes for clojure.string:\n\n1. Strings are objects (as opposed to sequences). As such, the\n   string being manipulated is the first argument to a function;\n   passing nil will result in a NullPointerException unless\n   documented otherwise. If you want sequence-y behavior instead,\n   use a sequence.\n\n2. Functions are generally not lazy, and call straight to host\n   methods where those are available and efficient.\n\n3. Functions take advantage of String implementation details to\n   write high-performing loop/recurs instead of using higher-order\n   functions. (This is not idiomatic in general-purpose application\n   code.)\n\n4. When a function is documented to accept a string argument, it\n   will take any implementation of the correct *interface* on the\n   host platform. In Java, this is CharSequence, which is more\n   general than String. In ordinary usage you will almost always\n   pass concrete strings. If you are doing something unusual,\n   e.g. passing a mutable implementation of CharSequence, then\n   thread-safety is your responsibility."));
 }
 public string_fn__8760() {
  super();
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2), const__3.getRawRoot(), const__4);
 }
}
