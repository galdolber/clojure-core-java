package clojure;

import clojure.lang.*;

public final class pprint_write_initial_lines_fn__7548 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Var const__17;
 public static final java.lang.Object const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final java.lang.Object const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.Var const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.Keyword const__29;
 public static final clojure.lang.Var const__30;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "per-line-prefix");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "logical-blocks");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "buffering");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "mode");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "add-to-buffer");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "make-buffer-blob");
  const__14 = (clojure.lang.Var)RT.var("clojure.pprint", "write-buffered-output");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "write-white-space");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "base");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__18 = (java.lang.Object)Character.valueOf((char)10);
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "butlast");
  const__22 = (java.lang.Object)0L;
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__24 = (clojure.lang.Var)RT.var("clojure.pprint", "pp-newline");
  const__25 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__29 = (clojure.lang.Keyword)Keyword.intern(null, "writing");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "last");
 }
 Object this1;
 Object lines3;
 public pprint_write_initial_lines_fn__7548(final Object this1, final Object lines3) {
  super();
  this.this1 = this1;
  this.lines3 = lines3;
 }
 public java.lang.Object invoke() {
  {
   Object prefix1 = RT.get(((IFn)const__1.getRawRoot()).invoke(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "logical-blocks"))), Keyword.intern(null, "per-line-prefix"));
   Object l2 = ((IFn)const__1.getRawRoot()).invoke(this.lines3);
   if (clojure.lang.Util.equiv(((java.lang.Object)const__5), ((java.lang.Object)RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "mode"))))) {
    {
     Object oldpos3 = RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "pos"));
     Object newpos4 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)oldpos3), (long)clojure.lang.RT.count(((java.lang.Object)l2))));
     ((IFn)const__10.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1), const__11.getRawRoot(), const__7, newpos4);
     ((IFn)const__12.getRawRoot()).invoke(this.this1, ((IFn)const__13.getRawRoot()).invoke(l2, null, oldpos3, newpos4));
     ((IFn)const__14.getRawRoot()).invoke(this.this1);
    }
   } else {
    ((IFn)const__15.getRawRoot()).invoke(this.this1);
    Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{l2});
   }
   Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)const__18)))});
   {
    Object seq_75495 = ((IFn)const__19.getRawRoot()).invoke(((IFn)const__20.getRawRoot()).invoke(((IFn)const__21.getRawRoot()).invoke(this.lines3)));
    Object chunk_75506 = null;
    long count_75517 = 0L;
    long i_75528 = 0L;
    while(true) {
     if (clojure.lang.Numbers.lt((long)i_75528, (long)count_75517)) {
      {
       Object l9 = ((java.lang.Object)((clojure.lang.Indexed)chunk_75506).nth((int)RT.intCast(i_75528)));
       Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{l9});
       Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{((IFn)const__24.getRawRoot()).invoke()});
       Object __r4954 = prefix1;
       if (__r4954 != null && !(__r4954 == Boolean.FALSE)) {
        Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{prefix1});
       } else {
       }
       long i_75528___aux = clojure.lang.Numbers.unchecked_inc((long)i_75528);
       i_75528 = i_75528___aux;
       continue;
      }
     } else {
      {
       Object temp__4117__auto__10 = ((IFn)const__19.getRawRoot()).invoke(seq_75495);
       Object __r4956 = temp__4117__auto__10;
       if (__r4956 != null && !(__r4956 == Boolean.FALSE)) {
        {
         Object seq_754911 = temp__4117__auto__10;
         Object __r4958 = ((IFn)const__26.getRawRoot()).invoke(seq_754911);
         if (__r4958 != null && !(__r4958 == Boolean.FALSE)) {
          {
           Object c__4343__auto__12 = ((IFn)const__27.getRawRoot()).invoke(seq_754911);
           java.lang.Object seq_75495___aux = ((IFn)const__28.getRawRoot()).invoke(seq_754911);
           java.lang.Object chunk_75506___aux = c__4343__auto__12;
           long count_75517___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__12)));
           long i_75528___aux = clojure.lang.RT.intCast((long)0L);
           seq_75495 = seq_75495___aux;
           chunk_75506 = chunk_75506___aux;
           count_75517 = count_75517___aux;
           i_75528 = i_75528___aux;
           continue;
          }
         } else {
          {
           Object l13 = ((IFn)const__1.getRawRoot()).invoke(seq_754911);
           Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{l13});
           Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{((IFn)const__24.getRawRoot()).invoke()});
           Object __r4960 = prefix1;
           if (__r4960 != null && !(__r4960 == Boolean.FALSE)) {
            Reflector.invokeInstanceMethod(RT.get(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1)), Keyword.intern(null, "base")), "write", new Object[]{prefix1});
           } else {
           }
           java.lang.Object seq_75495___aux = ((IFn)const__20.getRawRoot()).invoke(seq_754911);
           java.lang.Object chunk_75506___aux = null;
           long count_75517___aux = 0L;
           long i_75528___aux = 0L;
           seq_75495 = seq_75495___aux;
           chunk_75506 = chunk_75506___aux;
           count_75517 = count_75517___aux;
           i_75528 = i_75528___aux;
           continue;
          }
         }
        }
       } else {
       }
      }
     }
     break;
    }
   }
   ((IFn)const__10.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.this1), const__11.getRawRoot(), const__5, const__29);
   return ((IFn)const__30.getRawRoot()).invoke(this.lines3);
  }
 }
}
