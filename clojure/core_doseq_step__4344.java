package clojure;

import clojure.lang.*;

public final class core_doseq_step__4344 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Keyword const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.IPersistentMap const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Symbol const__31;
 public static final clojure.lang.Symbol const__32;
 public static final clojure.lang.Symbol const__33;
 public static final clojure.lang.Symbol const__34;
 public static final clojure.lang.Symbol const__35;
 public static final clojure.lang.Symbol const__36;
 public static final clojure.lang.Symbol const__37;
 public static final clojure.lang.Symbol const__38;
 public static final clojure.lang.Symbol const__39;
 public static final clojure.lang.Symbol const__40;
 public static final clojure.lang.Symbol const__41;
 public static final clojure.lang.Symbol const__42;
 public static final clojure.lang.Symbol const__43;
 public static final clojure.lang.Symbol const__44;
 public static final clojure.lang.Symbol const__45;
 public static final clojure.lang.Symbol const__46;
 public static final clojure.lang.Symbol const__47;
 public static final clojure.lang.Symbol const__48;
 public static final clojure.lang.Symbol const__49;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "keyword?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "nnext");
  const__9 = (java.lang.Object)0L;
  const__10 = (java.lang.Object)1L;
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "let");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "while");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "when");
  const__17 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__18 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__21 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.IChunk");
  const__23 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "clojure.lang.IChunk"));
  const__24 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "next");
  const__26 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__27 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "unchecked-inc");
  const__28 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "loop");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__31 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "seq");
  const__32 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__33 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "<");
  const__34 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__35 = (clojure.lang.Symbol)Symbol.intern(null, ".nth");
  const__36 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-let");
  const__37 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "seq");
  const__38 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__39 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunked-seq?");
  const__40 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__41 = (clojure.lang.Symbol)Symbol.intern(null, "c__4343__auto__");
  const__42 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk-first");
  const__43 = (clojure.lang.Symbol)Symbol.intern(null, "recur");
  const__44 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "chunk-rest");
  const__45 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "int");
  const__46 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "count");
  const__47 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "int");
  const__48 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__49 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "first");
 }
 Object body4;
 public core_doseq_step__4344(final Object body4) {
  super();
  this.body4 = body4;
 }
 public java.lang.Object invoke(java.lang.Object recform1, java.lang.Object exprs2) {
  Object __r2583 = ((IFn)const__0.getRawRoot()).invoke(exprs2);
  if (__r2583 != null && !(__r2583 == Boolean.FALSE)) {
   return RT.vector(Boolean.TRUE, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), this.body4)));
  } else {
   {
    Object k3 = ((IFn)const__5.getRawRoot()).invoke(exprs2);
    Object v4 = ((IFn)const__6.getRawRoot()).invoke(exprs2);
    Object __r2585 = ((IFn)const__7.getRawRoot()).invoke(k3);
    if (__r2585 != null && !(__r2585 == Boolean.FALSE)) {
     {
      Object steppair5 = ((IFn)this).invoke(recform1, ((IFn)const__8.getRawRoot()).invoke(exprs2));
      Object needrec6 = ((IFn)steppair5).invoke(const__9);
      Object subform7 = ((IFn)steppair5).invoke(const__10);
      if (clojure.lang.Util.equiv(((java.lang.Object)k3), ((java.lang.Object)const__12))) {
       return RT.vector(needrec6, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__13), ((IFn)const__3.getRawRoot()).invoke(v4), ((IFn)const__3.getRawRoot()).invoke(subform7))));
      } else {
       if (clojure.lang.Util.equiv(((java.lang.Object)k3), ((java.lang.Object)const__14))) {
        Object __r2588;
        Object __r2589 = needrec6;
        if (__r2589 != null && !(__r2589 == Boolean.FALSE)) {
         __r2588 = RT.vector(recform1);
        } else {
         __r2588 = null;
        }
        return RT.vector(Boolean.FALSE, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__15), ((IFn)const__3.getRawRoot()).invoke(v4), ((IFn)const__3.getRawRoot()).invoke(subform7), __r2588)));
       } else {
        if (clojure.lang.Util.equiv(((java.lang.Object)k3), ((java.lang.Object)const__16))) {
         Object __r2591;
         Object __r2592 = needrec6;
         if (__r2592 != null && !(__r2592 == Boolean.FALSE)) {
          __r2591 = RT.vector(recform1);
         } else {
          __r2591 = null;
         }
         return RT.vector(Boolean.FALSE, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__17), ((IFn)const__3.getRawRoot()).invoke(v4), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__18), ((IFn)const__3.getRawRoot()).invoke(subform7), __r2591))), ((IFn)const__3.getRawRoot()).invoke(recform1))));
        } else {
         return null;
        }
       }
      }
     }
    } else {
     {
      Object seq_8 = ((IFn)const__19.getRawRoot()).invoke("seq_");
      Object chunk_9 = ((IFn)const__20.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke("chunk_"), const__23);
      Object count_10 = ((IFn)const__19.getRawRoot()).invoke("count_");
      Object i_11 = ((IFn)const__19.getRawRoot()).invoke("i_");
      Object recform12 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__24), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__25), ((IFn)const__3.getRawRoot()).invoke(seq_8)))), ((IFn)const__3.getRawRoot()).invoke(null), ((IFn)const__3.getRawRoot()).invoke(const__9), ((IFn)const__3.getRawRoot()).invoke(const__9)));
      Object steppair13 = ((IFn)this).invoke(recform12, ((IFn)const__8.getRawRoot()).invoke(exprs2));
      Object needrec14 = ((IFn)steppair13).invoke(const__9);
      Object subform15 = ((IFn)steppair13).invoke(const__10);
      Object recform_chunk16 = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__26), ((IFn)const__3.getRawRoot()).invoke(seq_8), ((IFn)const__3.getRawRoot()).invoke(chunk_9), ((IFn)const__3.getRawRoot()).invoke(count_10), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__27), ((IFn)const__3.getRawRoot()).invoke(i_11))))));
      Object steppair_chunk17 = ((IFn)this).invoke(recform_chunk16, ((IFn)const__8.getRawRoot()).invoke(exprs2));
      Object subform_chunk18 = ((IFn)steppair_chunk17).invoke(const__10);
      Object __r2593;
      Object __r2594 = needrec14;
      if (__r2594 != null && !(__r2594 == Boolean.FALSE)) {
       __r2593 = RT.vector(recform_chunk16);
      } else {
       __r2593 = null;
      }
      Object __r2595;
      Object __r2596 = needrec14;
      if (__r2596 != null && !(__r2596 == Boolean.FALSE)) {
       __r2595 = RT.vector(recform12);
      } else {
       __r2595 = null;
      }
      return RT.vector(Boolean.TRUE, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__28), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__29.getRawRoot()).invoke(const__30.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(seq_8), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__31), ((IFn)const__3.getRawRoot()).invoke(v4)))), ((IFn)const__3.getRawRoot()).invoke(chunk_9), ((IFn)const__3.getRawRoot()).invoke(null), ((IFn)const__3.getRawRoot()).invoke(count_10), ((IFn)const__3.getRawRoot()).invoke(const__9), ((IFn)const__3.getRawRoot()).invoke(i_11), ((IFn)const__3.getRawRoot()).invoke(const__9))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__32), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__33), ((IFn)const__3.getRawRoot()).invoke(i_11), ((IFn)const__3.getRawRoot()).invoke(count_10)))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__34), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__29.getRawRoot()).invoke(const__30.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(k3), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__35), ((IFn)const__3.getRawRoot()).invoke(chunk_9), ((IFn)const__3.getRawRoot()).invoke(i_11)))))))), ((IFn)const__3.getRawRoot()).invoke(subform_chunk18), __r2593))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__36), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__29.getRawRoot()).invoke(const__30.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(seq_8), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__37), ((IFn)const__3.getRawRoot()).invoke(seq_8)))))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__38), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__39), ((IFn)const__3.getRawRoot()).invoke(seq_8)))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__40), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__29.getRawRoot()).invoke(const__30.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__41), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__42), ((IFn)const__3.getRawRoot()).invoke(seq_8)))))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__43), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__44), ((IFn)const__3.getRawRoot()).invoke(seq_8)))), ((IFn)const__3.getRawRoot()).invoke(const__41), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__45), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__46), ((IFn)const__3.getRawRoot()).invoke(const__41))))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__47), ((IFn)const__3.getRawRoot()).invoke(const__9)))))))))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__48), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__29.getRawRoot()).invoke(const__30.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(k3), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__49), ((IFn)const__3.getRawRoot()).invoke(seq_8)))))))), ((IFn)const__3.getRawRoot()).invoke(subform15), __r2595)))))))))))))));
     }
    }
   }
  }
 }
}
