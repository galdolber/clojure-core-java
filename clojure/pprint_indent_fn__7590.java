package clojure;

import clojure.lang.*;

public final class pprint_indent_fn__7590 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "logical-blocks");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "writing");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "write-white-space");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "ref-set");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "indent");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "block");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "start-col");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "current");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "add-to-buffer");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "make-indent-t");
 }
 Object relative_to2;
 Object this1;
 Object offset3;
 public pprint_indent_fn__7590(final Object relative_to2, final Object this1, final Object offset3) {
  super();
  this.relative_to2 = relative_to2;
  this.this1 = this1;
  this.offset3 = offset3;
 }
 public java.lang.Object invoke() {
  {
   Object lb1 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "logical-blocks"));
   if (clojure.lang.Util.equiv(((java.lang.Object)RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "mode"))), ((java.lang.Object)const__4))) {
    ((IFn)const__5.getRawRoot()).invoke(this.this1);
    Object __r4987 = null;
    {
     Object pred__75912 = const__2.getRawRoot();
     Object expr__75923 = this.relative_to2;
     Object __r4988;
     Object __r4989 = ((IFn)pred__75912).invoke(const__9, expr__75923);
     if (__r4989 != null && !(__r4989 == Boolean.FALSE)) {
      __r4988 = ((IFn)const__1.getRawRoot()).invoke(RT.get(lb1, Keyword.intern(null, "start-col")));
     } else {
      Object __r4990;
      Object __r4991 = ((IFn)pred__75912).invoke(const__11, expr__75923);
      if (__r4991 != null && !(__r4991 == Boolean.FALSE)) {
       __r4990 = ((IFn)const__12.getRawRoot()).invoke(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")));
      } else {
       Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__14.getRawRoot()).invoke("No matching clause: ", expr__75923))));
       __r4990 = null;
      }
      __r4988 = __r4990;
     }
     __r4987 = __r4988;
    }
    return ((IFn)const__6.getRawRoot()).invoke(RT.get(lb1, Keyword.intern(null, "indent")), ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)this.offset3), ((java.lang.Object)__r4987))));
   } else {
    {
     Object pos4 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "pos"));
     return ((IFn)const__16.getRawRoot()).invoke(this.this1, ((IFn)const__17.getRawRoot()).invoke(lb1, this.relative_to2, this.offset3, pos4, pos4));
    }
   }
  }
 }
}
