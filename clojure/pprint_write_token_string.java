package clojure;

import clojure.lang.*;

public final class pprint_write_token_string extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "split-at-newline");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (java.lang.Object)0L;
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "write-tokens");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "get-section");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "emit-nl?");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "get-sub-section");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "emit-nl");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "tokens-fit?");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "write-token-string");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "into");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "concat");
 }
 public pprint_write_token_string() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object tokens2) {
  {
   Object vec__75333 = ((IFn)const__0.getRawRoot()).invoke(tokens2);
   Object a4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__75333), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object b5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__75333), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object __r4932 = a4;
   if (__r4932 != null && !(__r4932 == Boolean.FALSE)) {
    ((IFn)const__4.getRawRoot()).invoke(this1, a4, Boolean.FALSE);
   } else {
   }
   Object __r4934 = b5;
   if (__r4934 != null && !(__r4934 == Boolean.FALSE)) {
    {
     Object vec__75346 = ((IFn)const__5.getRawRoot()).invoke(b5);
     Object section7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__75346), (int)RT.intCast(0L), ((java.lang.Object)null)));
     Object remainder8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__75346), (int)RT.intCast(1L), ((java.lang.Object)null)));
     Object newl9 = ((IFn)const__6.getRawRoot()).invoke(b5);
     {
      Object do_nl10 = ((IFn)const__7.getRawRoot()).invoke(newl9, this1, section7, ((IFn)const__8.getRawRoot()).invoke(b5));
      Object __r4935;
      Object __r4936 = do_nl10;
      if (__r4936 != null && !(__r4936 == Boolean.FALSE)) {
       ((IFn)const__9.getRawRoot()).invoke(this1, newl9);
       __r4935 = ((IFn)const__10.getRawRoot()).invoke(b5);
      } else {
       __r4935 = b5;
      }
      Object result11 = __r4935;
      Object long_section12 = ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(this1, result11));
      Object __r4937;
      Object __r4938 = long_section12;
      if (__r4938 != null && !(__r4938 == Boolean.FALSE)) {
       Object __r4939 = null;
       {
        Object rem213 = ((IFn)const__13.getRawRoot()).invoke(this1, section7);
        Object __r4940;
        if (clojure.lang.Util.equiv(((java.lang.Object)rem213), ((java.lang.Object)section7))) {
         ((IFn)const__4.getRawRoot()).invoke(this1, section7, Boolean.FALSE);
         __r4940 = remainder8;
        } else {
         __r4940 = ((IFn)const__15.getRawRoot()).invoke(clojure.lang.PersistentVector.EMPTY, ((IFn)const__16.getRawRoot()).invoke(rem213, remainder8));
        }
        __r4939 = __r4940;
       }
       __r4937 = __r4939;
      } else {
       __r4937 = result11;
      }
      Object result14 = __r4937;
      return result14;
     }
    }
   } else {
    return null;
   }
  }
 }
}
