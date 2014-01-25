package clojure;

import clojure.lang.*;

public final class pprint_start_block_fn__7579 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Keyword const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "logical-block");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "logical-blocks");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "ref");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "writing");
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "write-white-space");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block-callback");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "start");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "ref-set");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "start-col");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "indent");
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__22 = (clojure.lang.Var)RT.var("clojure.pprint", "add-to-buffer");
  const__23 = (clojure.lang.Var)RT.var("clojure.pprint", "make-start-block-t");
 }
 Object this1;
 Object per_line_prefix3;
 Object suffix4;
 Object prefix2;
 public pprint_start_block_fn__7579(final Object this1, final Object per_line_prefix3, final Object suffix4, final Object prefix2) {
  super();
  this.this1 = this1;
  this.per_line_prefix3 = per_line_prefix3;
  this.suffix4 = suffix4;
  this.prefix2 = prefix2;
 }
 public java.lang.Object invoke() {
  {
   Object lb1 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "logical-blocks")), null, ((IFn)const__4.getRawRoot()).invoke(const__5), ((IFn)const__4.getRawRoot()).invoke(const__5), ((IFn)const__4.getRawRoot()).invoke(Boolean.FALSE), ((IFn)const__4.getRawRoot()).invoke(Boolean.FALSE), this.prefix2, this.per_line_prefix3, this.suffix4);
   ((IFn)const__6.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1), const__7.getRawRoot(), const__2, lb1);
   if (clojure.lang.Util.equiv(((java.lang.Object)RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "mode"))), ((java.lang.Object)const__10))) {
    ((IFn)const__11.getRawRoot()).invoke(this.this1);
    {
     Object temp__4117__auto__2 = RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "logical-block-callback"));
     Object __r4974 = temp__4117__auto__2;
     if (__r4974 != null && !(__r4974 == Boolean.FALSE)) {
      {
       Object cb3 = temp__4117__auto__2;
       ((IFn)cb3).invoke(const__13);
      }
     } else {
     }
    }
    Object __r4976 = this.prefix2;
    if (__r4976 != null && !(__r4976 == Boolean.FALSE)) {
     Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{this.prefix2});
    } else {
    }
    {
     Object col4 = ((IFn)const__15.getRawRoot()).invoke(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")));
     ((IFn)const__16.getRawRoot()).invoke(RT.get(lb1, Keyword.intern(null, "start-col")), col4);
     return ((IFn)const__16.getRawRoot()).invoke(RT.get(lb1, Keyword.intern(null, "indent")), col4);
    }
   } else {
    {
     Object oldpos5 = RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "pos"));
     Object __r4977;
     Object __r4978 = this.prefix2;
     if (__r4978 != null && !(__r4978 == Boolean.FALSE)) {
      __r4977 = Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)this.prefix2)));
     } else {
      __r4977 = const__5;
     }
     Object newpos6 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)oldpos5), ((java.lang.Object)__r4977)));
     ((IFn)const__6.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1), const__7.getRawRoot(), const__19, newpos6);
     return ((IFn)const__22.getRawRoot()).invoke(this.this1, ((IFn)const__23.getRawRoot()).invoke(lb1, oldpos5, newpos6));
    }
   }
  }
 }
}
