package clojure;

import clojure.lang.*;

public final class pprint_process_clause_fn__8177 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "format-error");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "right-bracket");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "process-bracket");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "right");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "directive");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "def");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "right-bracket");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "params");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "else-separator?");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__14 = (clojure.lang.Var)RT.var("clojure.pprint", "separator?");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "separator");
 }
 Object bracket_info1;
 Object offset2;
 public pprint_process_clause_fn__8177(final Object bracket_info1, final Object offset2) {
  super();
  this.bracket_info1 = bracket_info1;
  this.offset2 = offset2;
 }
 public java.lang.Object invoke(java.lang.Object remainder1) {
  Object __r5825 = ((IFn)const__0.getRawRoot()).invoke(remainder1);
  if (__r5825 != null && !(__r5825 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke("No closing bracket found.", this.offset2);
  } else {
   {
    Object this2 = ((IFn)const__2.getRawRoot()).invoke(remainder1);
    Object remainder3 = ((IFn)const__3.getRawRoot()).invoke(remainder1);
    Object __r5827 = ((IFn)const__4.getRawRoot()).invoke(this2);
    if (__r5827 != null && !(__r5827 == Boolean.FALSE)) {
     return ((IFn)const__5.getRawRoot()).invoke(this2, remainder3);
    } else {
     if (clojure.lang.Util.equiv(((java.lang.Object)RT.get(this.bracket_info1, Keyword.intern(null, "right"))), ((java.lang.Object)RT.get(RT.get(this2, Keyword.intern(null, "def")), Keyword.intern(null, "directive"))))) {
      return RT.vector(null, RT.vector(const__10, RT.get(this2, Keyword.intern(null, "params")), null, remainder3));
     } else {
      Object __r5830 = ((IFn)const__12.getRawRoot()).invoke(this2);
      if (__r5830 != null && !(__r5830 == Boolean.FALSE)) {
       return RT.vector(null, RT.vector(const__13, null, RT.get(this2, Keyword.intern(null, "params")), remainder3));
      } else {
       Object __r5832 = ((IFn)const__14.getRawRoot()).invoke(this2);
       if (__r5832 != null && !(__r5832 == Boolean.FALSE)) {
        return RT.vector(null, RT.vector(const__15, null, null, remainder3));
       } else {
        Object __r5834 = Boolean.TRUE;
        if (__r5834 != null && !(__r5834 == Boolean.FALSE)) {
         return RT.vector(this2, remainder3);
        } else {
         return null;
        }
       }
      }
     }
    }
   }
  }
 }
}
