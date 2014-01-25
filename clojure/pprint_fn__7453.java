package clojure;

import clojure.lang.*;

public final class pprint_fn__7453 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "ref-set");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "indent");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "offset");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "relative-to");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "block");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "start-col");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "current");
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public pprint_fn__7453() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object token2) {
  {
   Object lb3 = RT.get(token2, Keyword.intern(null, "logical-block"));
   Object __r4869 = null;
   {
    Object pred__74544 = const__5.getRawRoot();
    Object expr__74555 = RT.get(token2, Keyword.intern(null, "relative-to"));
    Object __r4870;
    Object __r4871 = ((IFn)pred__74544).invoke(const__7, expr__74555);
    if (__r4871 != null && !(__r4871 == Boolean.FALSE)) {
     __r4870 = ((IFn)const__8.getRawRoot()).invoke(RT.get(lb3, Keyword.intern(null, "start-col")));
    } else {
     Object __r4872;
     Object __r4873 = ((IFn)pred__74544).invoke(const__10, expr__74555);
     if (__r4873 != null && !(__r4873 == Boolean.FALSE)) {
      __r4872 = ((IFn)const__11.getRawRoot()).invoke(RT.get(((IFn)const__8.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(this1)), Keyword.intern(null, "base")));
     } else {
      Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__13.getRawRoot()).invoke("No matching clause: ", expr__74555))));
      __r4872 = null;
     }
     __r4870 = __r4872;
    }
    __r4869 = __r4870;
   }
   return ((IFn)const__1.getRawRoot()).invoke(RT.get(lb3, Keyword.intern(null, "indent")), ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)RT.get(token2, Keyword.intern(null, "offset"))), ((java.lang.Object)__r4869))));
  }
 }
}
