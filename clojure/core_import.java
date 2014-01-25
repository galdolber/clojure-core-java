package clojure;

import clojure.lang.*;

public final class core_import extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
 }
 public core_import() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object import_symbols_or_lists3) {
  {
   Object specs4 = ((IFn)const__0.getRawRoot()).invoke(new clojure.core_import_fn__4379(), import_symbols_or_lists3);
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__0.getRawRoot()).invoke(new clojure.core_import_fn__4382(), ((IFn)const__5.getRawRoot()).invoke(new clojure.core_import_fn__4384(), clojure.lang.PersistentVector.EMPTY, specs4))));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
