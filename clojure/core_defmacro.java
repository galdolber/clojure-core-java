package clojure;

import clojure.lang.*;

public final class core_defmacro extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.IPersistentStack const__9;
 public static final clojure.lang.Symbol const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__6 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defn");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__8 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__9 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "setMacro")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 465, Keyword.intern(null, "column"), 49));
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "var");
 }
 public core_defmacro() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object args4) {
  {
   Object prefix5 = ((IFn)new clojure.core_defmacro_fn__3905(args4, name3)).invoke();
   Object fdecl6 = ((IFn)new clojure.core_defmacro_fn__3907(args4)).invoke();
   Object __r2293;
   Object __r2294 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(fdecl6));
   if (__r2294 != null && !(__r2294 == Boolean.FALSE)) {
    __r2293 = ((IFn)const__2.getRawRoot()).invoke(fdecl6);
   } else {
    __r2293 = fdecl6;
   }
   Object fdecl7 = __r2293;
   Object add_implicit_args8 = new clojure.core_defmacro_add_implicit_args__3909();
   Object add_args9 = new clojure.core_defmacro_add_args__3911(add_implicit_args8);
   Object fdecl10 = ((IFn)const__3.getRawRoot()).invoke(((IFn)add_args9).invoke(clojure.lang.PersistentVector.EMPTY, fdecl7));
   Object decl11 = ((IFn)new clojure.core_defmacro_fn__3913(fdecl10, prefix5)).invoke();
   return ((IFn)const__2.getRawRoot()).invoke(const__4, ((IFn)const__5.getRawRoot()).invoke(const__6, decl11), ((IFn)const__2.getRawRoot()).invoke(const__7, ((IFn)const__2.getRawRoot()).invoke(const__8, name3), const__9), ((IFn)const__2.getRawRoot()).invoke(const__10, name3));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
