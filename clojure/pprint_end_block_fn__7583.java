package clojure;

import clojure.lang.*;

public final class pprint_end_block_fn__7583 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final java.lang.Object const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Keyword const__18;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "logical-blocks");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "suffix");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "writing");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "write-white-space");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block-callback");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "end");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__13 = (java.lang.Object)0L;
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "add-to-buffer");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "make-end-block-t");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "parent");
 }
 Object this1;
 public pprint_end_block_fn__7583(final Object this1) {
  super();
  this.this1 = this1;
 }
 public java.lang.Object invoke() {
  {
   Object lb1 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "logical-blocks"));
   Object suffix2 = RT.get(lb1, Keyword.intern(null, "suffix"));
   if (clojure.lang.Util.equiv(((java.lang.Object)RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "mode"))), ((java.lang.Object)const__5))) {
    ((IFn)const__6.getRawRoot()).invoke(this.this1);
    Object __r4981 = suffix2;
    if (__r4981 != null && !(__r4981 == Boolean.FALSE)) {
     Reflector.invokeInstanceMethod(RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{suffix2});
    } else {
    }
    {
     Object temp__4117__auto__3 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "logical-block-callback"));
     Object __r4983 = temp__4117__auto__3;
     if (__r4983 != null && !(__r4983 == Boolean.FALSE)) {
      {
       Object cb4 = temp__4117__auto__3;
       ((IFn)cb4).invoke(const__9);
      }
     } else {
     }
    }
   } else {
    {
     Object oldpos5 = RT.get(((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "pos"));
     Object __r4984;
     Object __r4985 = suffix2;
     if (__r4985 != null && !(__r4985 == Boolean.FALSE)) {
      __r4984 = Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)suffix2)));
     } else {
      __r4984 = const__13;
     }
     Object newpos6 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)oldpos5), ((java.lang.Object)__r4984)));
     ((IFn)const__14.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1), const__15.getRawRoot(), const__10, newpos6);
     ((IFn)const__16.getRawRoot()).invoke(this.this1, ((IFn)const__17.getRawRoot()).invoke(lb1, oldpos5, newpos6));
    }
   }
   return ((IFn)const__14.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.this1), const__15.getRawRoot(), const__0, RT.get(lb1, Keyword.intern(null, "parent")));
  }
 }
}
