package clojure;

import clojure.lang.*;

public final class template_do_template extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "partition");
 }
 public template_do_template() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object argv3, java.lang.Object expr4, java.lang.Object values5) {
  {
   int c6 = clojure.lang.RT.count(((java.lang.Object)argv3));
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__5.getRawRoot()).invoke(new clojure.template_do_template_fn__7074(argv3, expr4), ((IFn)const__6.getRawRoot()).invoke(Integer.valueOf(c6), values5))));
  }
 }
 public int getRequiredArity() {
  return 4;
 }
}
