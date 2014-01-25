package clojure;

import clojure.lang.*;

public final class pprint_modify_case extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public pprint_modify_case() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object make_writer1, java.lang.Object params2, java.lang.Object navigator3, java.lang.Object offsets4) {
  {
   Object clause5 = ((IFn)const__0.getRawRoot()).invoke(RT.get(params2, Keyword.intern(null, "clauses")));
   {
    ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4, ((IFn)make_writer1).invoke(const__4.get())));
    try {
     return ((IFn)const__5.getRawRoot()).invoke(clause5, navigator3, RT.get(params2, Keyword.intern(null, "base-args")));
    } finally {
     ((IFn)const__7.getRawRoot()).invoke();
    }
   }
  }
 }
}
