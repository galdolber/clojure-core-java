package clojure;

import clojure.lang.*;

public final class pprint_pll_mod_body_inner__7652 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "macroexpand");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "loop*");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__9 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__10 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "inc");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__12 = (clojure.lang.Var)RT.var("clojure.walk", "walk");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "identity");
 }
 Object var_sym1;
 public pprint_pll_mod_body_inner__7652(final Object var_sym1) {
  super();
  this.var_sym1 = var_sym1;
 }
 public java.lang.Object invoke(java.lang.Object form1) {
  Object __r5043 = ((IFn)const__0.getRawRoot()).invoke(form1);
  if (__r5043 != null && !(__r5043 == Boolean.FALSE)) {
   {
    Object form2 = ((IFn)const__1.getRawRoot()).invoke(form1);
    {
     Object pred__76533 = const__2.getRawRoot();
     Object expr__76544 = ((IFn)const__3.getRawRoot()).invoke(form2);
     Object __r5045 = ((IFn)pred__76533).invoke(const__4, expr__76544);
     if (__r5045 != null && !(__r5045 == Boolean.FALSE)) {
      return form2;
     } else {
      Object __r5047 = ((IFn)pred__76533).invoke(const__5, expr__76544);
      if (__r5047 != null && !(__r5047 == Boolean.FALSE)) {
       return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__9), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__10), ((IFn)const__8.getRawRoot()).invoke(this.var_sym1)))))), ((IFn)const__11.getRawRoot()).invoke(form2));
      } else {
       return ((IFn)const__12.getRawRoot()).invoke(this, const__13.getRawRoot(), form2);
      }
     }
    }
   }
  } else {
   return form1;
  }
 }
}
